package com.company;


public class ElevatorService {


        public static Elevator callElevator(int floor)
        {
            int dfloor=House.totalFloors;
            int id = 0;
            for(int i=0;i<3;i++)
            {
                if(dfloor>=Math.abs(House.elevators[i].floor-floor))
                {
                    dfloor=Math.abs(House.elevators[i].floor-floor);
                    id=House.elevators[i].id;
                }
            }
            return House.elevators[id];
        }

        public static int moveTo(Elevator elevator, int floor)
        {
            if(floor<=House.totalFloors)
            {
                elevator.floor=floor;
                return floor;
            }
            else
            {
                return -1;
            }
        }
    }

