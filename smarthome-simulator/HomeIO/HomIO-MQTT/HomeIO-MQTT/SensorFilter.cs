﻿using EngineIO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HomeIO_MQTT
{
    public class SensorFilter
    {
        public bool Apply(MemoryBit mem)
        {
            return true;
        }

        private Dictionary<MemoryFloat, float> lastSentValue = new Dictionary<MemoryFloat, float>();

        public bool Apply(MemoryFloat mem)
        {
            if(mem.Name.Contains("Brightness Sensor"))
            {
                float value;
                if(lastSentValue.TryGetValue(mem, out value))
                {
                    if(Math.Abs(value - mem.Value) < 0.1 || ((Math.Abs(value - mem.Value) / value) < 0.1 && !mem.Name.Contains("O - Brightness Sensor")))
                    {
                        return false;
                    }
                    else
                    {
                        lastSentValue[mem] = mem.Value;
                    }
                }
                else
                {
                    lastSentValue.Add(mem, mem.Value);
                }
            }
            else if (mem.Name.Contains("Room Temperature"))
            {
                float value;
                if (lastSentValue.TryGetValue(mem, out value))
                {
                    if (Math.Abs(value - mem.Value) < 0.1)
                    {
                        return false;
                    }
                    else
                    {
                        lastSentValue[mem] = mem.Value;
                    }
                }
                else
                {
                    lastSentValue.Add(mem, mem.Value);
                }
            }
            else if (mem.Name.Contains("Roller Shades") && mem.Name.Contains("Openness"))
            {
                float value;
                if (lastSentValue.TryGetValue(mem, out value))
                {
                    if (mem.Value > 1 && mem.Value < 9 && Math.Abs(value - mem.Value) < 0.5)
                    {
                        return false;
                    }
                    else if (mem.Value != 0 && mem.Value != 10 && Math.Abs(value - mem.Value) < 0.2)
                    {
                        return false;
                    }
                    else
                    {
                        lastSentValue[mem] = mem.Value;
                    }
                }
                else
                {
                    lastSentValue.Add(mem, mem.Value);
                }
            }
            return true;
        }

        private int lastSentSecond = 0;
        public bool Apply(MemoryDateTime mem)
        {
            if (lastSentSecond == mem.Value.Second)
            {
                return false;
            }
            lastSentSecond = mem.Value.Second;
            return true;
        }
    }
}