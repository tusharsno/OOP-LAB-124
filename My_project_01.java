package project_1;

import java.util.Scanner;

public class My_project_01 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Initialization part_01
        int room;
        float length_room,width_room,height_room,total_space_room,height_space,width_space,length_tiles_of_floor, width_tiles_of_floor,//
              area_tiles_of_floor,total_number_of_tiles_which_use_for_floor,tiles_price_of_floor,total_cost_for_floor_tiles,net_wall_area,//
              length_tiles_of_wall,width_tiles_of_wall,area_tiles_of_wall,total_number_of_tiles_which_used_for_wall,tiles_price_of_wall,//
              total_cost_for_wall_tiles,height_of_brick,length_of_brick,area_of_brick, number_of_brick,price_of_brick,//
              total_price_of_brick;
        
        //Total room number count.
        System.out.print("Enter the total room number: ");
        room = input.nextInt();
        
        //Initialization part_02
        float total_floor_area_of_the_room = 0,total_wall_area =0,area_space = 0;
        
        /* Loops are used, counting the length and width and height of each room, to determine the total floor area and 
        total wall area of the room.
        So that each room is counted one by one */
        for(int i = 1;i <= room;i++)
        {
            System.out.printf("Enter the length of the room_%d: ",i);
            length_room  = input.nextFloat();
            System.out.printf("Enter the width of the room_%d: ",i);
            width_room = input.nextFloat();
            System.out.printf("Enter the height of wall of the room_%d: ",i);
            height_room = input.nextFloat();
            
            total_floor_area_of_the_room = total_floor_area_of_the_room + (length_room * width_room);
            //total_wall_area = total_wall_area + 2 * ((length_room * height_room) + (length_room * height_room));
            total_wall_area = 2 * ((length_room * height_room) + (width_room * height_room)) + total_wall_area;
            
            System.out.printf("How many door/window/space height & width in the room_%d: ",i);
            total_space_room = input.nextFloat();
            
            for(int j = 1;j <= total_space_room;j++)
            {
                System.out.printf("Enter the door/window/space height & width in the room_%d: ",i);
                height_space = input.nextFloat();
                width_space = input.nextFloat();
                
                //area_space = area_space + (height_space + width_space);
                area_space = (height_space * width_space) + area_space;
            }
        }
        
        // The total determined area is printed as 3,which is determined within the for loop.
        System.out.println("Total floor area of the room: "+total_floor_area_of_the_room);
        System.out.println("Total wall area of the room: "+total_wall_area);
        System.out.println("Total area of space of the room: "+area_space);
        
        //Determination of area of tiles used in floor 
        System.out.print("Please enter the lenght & width of floor tiles: ");
        length_tiles_of_floor = input.nextFloat();
        width_tiles_of_floor = input.nextFloat();
        area_tiles_of_floor = length_tiles_of_floor * width_tiles_of_floor;
        
        //Calculate total number of tiles used in floor 
        total_number_of_tiles_which_use_for_floor =  total_floor_area_of_the_room / area_tiles_of_floor;
        System.out.println("The required tiles for floor: "+total_number_of_tiles_which_use_for_floor);
        
        //Total cost of tiles required for floor 
        System.out.print("Please enter the price of floor tiles: ");
        tiles_price_of_floor = input.nextFloat();
        total_cost_for_floor_tiles = total_floor_area_of_the_room * tiles_price_of_floor;
        System.out.println("Total cost of lying floor tiles: "+total_cost_for_floor_tiles);
        
        //Calculate the wall area excluding space
        net_wall_area = total_wall_area - area_space;
        
        //Determination of area of tiles used in walls
        System.out.print("Please enter the length & width of wall tiles: ");
        length_tiles_of_wall = input.nextFloat();
        width_tiles_of_wall = input.nextFloat();
        area_tiles_of_wall = length_tiles_of_wall * width_tiles_of_wall;
        
        //Calculate total number of tiles used in wall
        total_number_of_tiles_which_used_for_wall = net_wall_area / area_tiles_of_wall;
        System.out.println("The required tiles for wall: "+total_number_of_tiles_which_used_for_wall);
        
        //Total cost of tiles required for wall
        System.out.print("Enter the price of wall tiles: ");
        tiles_price_of_wall = input.nextFloat();
        total_cost_for_wall_tiles = net_wall_area * tiles_price_of_wall;
        System.out.println("Total cost of lying wall tiles: "+total_cost_for_wall_tiles);
        
        //Calculating the required brick and price 
        System.out.print("Please enter the height & length of brick: ");
        height_of_brick = input.nextFloat();
        length_of_brick = input.nextFloat();
        
        area_of_brick = height_of_brick * length_of_brick;
        number_of_brick = net_wall_area / area_of_brick;
        System.out.println("Total number of requird brick: "+ number_of_brick);
        
        System.out.print("Please enter the price of brick: ");
        price_of_brick = input.nextFloat();
        
        total_price_of_brick = number_of_brick * price_of_brick;
        System.out.println("Total cost of brick: "+total_price_of_brick);
    }
}
