package at.jku.cis.dbprovider.task;

public class GeoInformation {

	private boolean enabled;
	private double latitude;
	private double longitude;
	private double gridID;

	public GeoInformation() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getGridID() {
		return gridID;
	}

	public void setGridID(double gridID) {
		this.gridID = gridID;
	}

}
