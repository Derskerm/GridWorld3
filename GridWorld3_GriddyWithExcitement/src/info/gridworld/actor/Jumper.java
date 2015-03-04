package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class Jumper extends Actor {

	public Jumper() {
		super();
	}
	
	/**
	 * Moves the Jumper two spaces forward in its direction if possible.
	 * If it would jump off the grid, it instead wraps around to the other side.
	 * If it can jump atop flowers, but if it were to jump on a rock, all rocks
	 * become flowers and the original flowers rocks, so it may proceed.
	 * Finally, if a Jumper detects another bug in its path, it and the other Jumper
	 * are removed from the grid, and two new purple Bugs are inserted into their
	 * previous locations.
	 */
	public void act(){
	}
	
	/**
	 * Moves the Jumper two spaces forward, wrapping around the grid if necessary.
	 */
	public void jump(){
		
	}
	
	/**
	 * Wraps the Jumper to the other side of the grid where it would normally 
	 * jump off of the grid.
	 */
	public void wrap() {
		
	}
	
	/**
	 * Removes the given actor from the grid and surrounds its location with flowers
	 * @param a the actor to be removed from the grid.
	 */
	public void killActor(Actor a) {
	}
	
	/**
	 * Returns the location a Jumper will occupy instead of jumping out of bounds.
	 * @return the wrapped location a Jumper will occupy
	 */
	public Location getWrappedLocation(){
		return null;
	}
	
	/**
	 * Removes all rocks from the grid, then inserts red flowers into each spot
	 * previously occupied by a rock.
	 */
	public void switchFlowersAndRocks(){
		
	}
}
