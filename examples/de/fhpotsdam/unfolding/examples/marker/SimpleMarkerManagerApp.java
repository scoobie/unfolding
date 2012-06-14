package de.fhpotsdam.unfolding.examples.marker;

import processing.core.PApplet;
import codeanticode.glgraphics.GLConstants;
import de.fhpotsdam.unfolding.Map;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimpleMarker;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Simple example with two markers, managed by the MarkerManager. The markers are cut-off at the border of the map.
 */
public class SimpleMarkerManagerApp extends PApplet {

	Map map;

	Location berlinLocation = new Location(52.5f, 13.4f);
	Location mexicoCityLocation = new Location(19.4f, -99.1f);

	public void setup() {
		size(800, 600, GLConstants.GLGRAPHICS);

		map = new Map(this, "map", 50, 50, 700, 500);
		map.zoomToLevel(2);
		map.panTo(new Location(40f, 20f));
		MapUtils.createDefaultEventDispatcher(this, map);

		SimpleMarker berlinMarker = new SimpleMarker(berlinLocation);
		SimpleMarker mexicoCityMarker = new SimpleMarker(mexicoCityLocation);
		map.addMarkers(berlinMarker, mexicoCityMarker);
	}

	public void draw() {
		background(240);
		map.draw();
	}

}
