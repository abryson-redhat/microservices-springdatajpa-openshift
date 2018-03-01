/**
 * 
 */
package com.carexpress.carrental.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author andymbrysoniii
 *
 */
@Entity
@Table(name = "address", schema = "carexpress")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5342338962427837316L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;
    
    @Column(name = "address_line_2", nullable = false)
    private String addressLine2;
    
    @Column(name = "address_line_3", nullable = false)
    private String addressLine3;
    
    @Column(name = "city", nullable = false)
    private String city;
    
    @Column(name = "state", nullable = false)
    private String state;
    
    @Column(name = "zip", nullable = false)
    private String zip;
    
    @Column(name = "country", nullable = false)
    private String country;
    
    @Column(name = "timezone", nullable = true)
    private String timeZone;

	/**
	 * @return the addressLine1
	 */
	public synchronized String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public synchronized void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public synchronized String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public synchronized void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public synchronized String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public synchronized void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the city
	 */
	public synchronized String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public synchronized void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public synchronized String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public synchronized void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public synchronized String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public synchronized void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the country
	 */
	public synchronized String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public synchronized void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the timeZone
	 */
	public synchronized String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public synchronized void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the id
	 */
	public synchronized Integer getId() {
		return id;
	}
    
    
    @Override
    public String toString() {
        return String.format(
                "Address[id=%d, addressLine1='%s', addressLine2='%s, addressLine3=%s, city=%s, state=%s, zip=%s, country=%s, timeZone=%s']",
                id, addressLine1, addressLine2, addressLine3, city, state, zip, country, timeZone);
    }
    
}
