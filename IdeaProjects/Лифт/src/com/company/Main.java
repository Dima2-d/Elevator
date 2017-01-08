package com.company;

import java.util.Random;
import java.util.Scanner;

import com.company.Elevator;
import com.company.House;
import com.company.ElevatorService;

public class Main {

    public static void main(String[] args) {

        House.totalFloors=10;
        House.elevators = new Elevator[3];

        House.elevators[0] = new Elevator();
        House.elevators[0].floor = 1;
        House.elevators[0].id = 0;

        House.elevators[1] = new Elevator();
        House.elevators[1].floor = 1;
        House.elevators[1].id = 1;

        House.elevators[2] = new Elevator();
        House.elevators[2].floor = 1;
        House.elevators[2].id = 2;

        Elevator cur_elevator;
        int new_floor;
        for(int i=0;i<5;i++)
        {
            System.out.println("Circle select elevator "+i);

            new_floor=(int)( Math.random()*House.totalFloors);
            System.out.println("Select floor "+new_floor);
            cur_elevator=ElevatorService.callElevator( new_floor );
            System.out.println("Select elevator id "+cur_elevator.id+" in floor "+cur_elevator.floor);
            if(ElevatorService.moveTo(cur_elevator, new_floor) >= 0 )
            {
                System.out.println("Select elevator id"+cur_elevator.id+" movie to floor "+cur_elevator.floor);
            }
            else
            {
                System.out.println("Floor "+new_floor+" not Found in House");
            }
        }
    }
}
