package boat;

import interfaces.StorageItem;
import models.Customer;
import trailer.Trailer;


public class BoatModel {
		
		Trailer t;
		String length;
		String beam;
		String registration;
		String make;
		String location;
		
		
		public Trailer getT() {
			return t;
		}

		public void setT(Trailer t) {
			this.t = t;
		}

		public String getLength() {
			return length;
		}

		public void setLength(String length) {
			this.length = length;
		}

		public String getBeam() {
			return beam;
		}

		public void setBeam(String beam) {
			this.beam = beam;
		}

		public String getRegistration() {
			return registration;
		}

		public void setRegistration(String registration) {
			this.registration = registration;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
		
		
		
	
}
