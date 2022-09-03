package amzChallengeRouterService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonRouterService {

	public static void main(String[] args) {
		// Dynamic Population of Buildings, no pun intended haha.
		System.out.println("= Building Occupancies =================================");
		
		final int NUM_OF_BUILDINGS = (int) (Math.random() * 5) + 1;
		final List<Integer> BUILDINGS = new ArrayList<Integer>(NUM_OF_BUILDINGS);
		
		for (int i = 0; i < NUM_OF_BUILDINGS; i++) {
			final int RESIDENTS = (int) (Math.random() * 2) + 1;
			BUILDINGS.add(RESIDENTS);
			
			System.out.println("Building: " + (i + 1) + ", Occupancy: " + RESIDENTS);
		}
		System.out.println();
		
		// Dynamic Population of Router Locations
		System.out.println("= Router Locations and Power ===========================");
		
		final int NUM_OF_ROUTERS = (int) (Math.random() * 2) + 1;
		final List<Router> ROUTERS = new ArrayList<Router>();
		
		for (int i = 0; i < NUM_OF_ROUTERS; i++) {
			final int ROUTER_LOCATION = (int) (Math.random() * NUM_OF_BUILDINGS) + 1;
			final int ROUTER_POWER = (int) (Math.random() * 3) + 1;
			
			final Router CURRENT_ROUTER = new Router(ROUTER_LOCATION, ROUTER_POWER);
			ROUTERS.add(CURRENT_ROUTER);
			
			System.out.println("Router in Building: " + ROUTER_LOCATION + ", Power: " + ROUTER_POWER);
		}
		System.out.println();
		
		// Final Router Service Reporting
		System.out.println("= Final Report =========================================");
		System.out.println("Served Buildings: " + getServedBuildings(BUILDINGS, ROUTERS));
	}
	
	private static int getServedBuildings(final List<Integer> BUILDINGS, final List<Router> ROUTERS) {
		// Service Report of the servicable buildings.
		final int NUM_OF_BUILDINGS = BUILDINGS.size();
        final int[] SERVICE_BY_BUILDING = new int[NUM_OF_BUILDINGS];
        
        // Temporary Integer to be Returned
        int servedBuildings = 0;
        
        // Iterates through each building in the serviced area.
        for (int i = 0; i < NUM_OF_BUILDINGS; i++) {
            // Gets the occupancy of the current building.
        	final int OCCUPANCY = BUILDINGS.get(i);
            
        	// Iterates through each router in the serviced area.
            for (int a = 0; a < ROUTERS.size(); a++) {
                // Retrieve Router Data
            	final Router CURRENT_ROUTER = ROUTERS.get(a);
                final int LOCATION = CURRENT_ROUTER.getLocation();
                final int RANGE = CURRENT_ROUTER.getRange();
                
                // Calculates the range of buildings the current router covers.
                final int LOWER_BOUND = (LOCATION - RANGE);
                final int UPPER_BOUND = (LOCATION + RANGE);
                
                // Calculates the current building's Location.
                final int CURRENT_BUILDING = (i + 1);
 
                // Validates if a building is in range of the router.
                if (CURRENT_BUILDING >= LOWER_BOUND && CURRENT_BUILDING <= UPPER_BOUND) {
                	// Grabs the current number of routers in range of the building.
                	final int CURRENT_SERVICE = SERVICE_BY_BUILDING[i];
                	
                	// Increments the number of routers servicing the building.
                	SERVICE_BY_BUILDING[i] = (CURRENT_SERVICE + 1);
                }
            }
            
            // Increments the number of served buildings.
            if (OCCUPANCY <= SERVICE_BY_BUILDING[i]) {
                servedBuildings++;
            }
        }
        return servedBuildings;
	}
}
