/**
 * 
 */
package com.carexpress.carrental.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author andymbrysoniii
 *
 */
@Entity
@Table(name = "location", schema = "carexpress")
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7958913522308052885L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "address_id", nullable = false)
    private Integer addressId;
    
    @Column(name = "phone_nbr", nullable = false)
    private String phoneNbr;
    
    @Column(name = "days_open", nullable = false)
    private String daysOpen;
    
    @Column(name = "hour_open", nullable = false)
    private String hourOpen;
    
    @Column(name = "hour_close", nullable = false)
    private String hourClose;
    
    @Column(name = "location_tz", nullable = false)
    private String locationTz;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;

	/**
	 * @return the name
	 */
	public synchronized String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public synchronized void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the addressId
	 */
	public synchronized Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public synchronized void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the phoneNbr
	 */
	public synchronized String getPhoneNbr() {
		return phoneNbr;
	}

	/**
	 * @param phoneNbr the phoneNbr to set
	 */
	public synchronized void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	/**
	 * @return the daysOpen
	 */
	public synchronized String getDaysOpen() {
		return daysOpen;
	}

	/**
	 * @param daysOpen the daysOpen to set
	 */
	public synchronized void setDaysOpen(String daysOpen) {
		this.daysOpen = daysOpen;
	}

	/**
	 * @return the hourOpen
	 */
	public synchronized String getHourOpen() {
		return hourOpen;
	}

	/**
	 * @param hourOpen the hourOpen to set
	 */
	public synchronized void setHourOpen(String hourOpen) {
		this.hourOpen = hourOpen;
	}

	/**
	 * @return the hourClose
	 */
	public synchronized String getHourClose() {
		return hourClose;
	}

	/**
	 * @param hourClose the hourClose to set
	 */
	public synchronized void setHourClose(String hourClose) {
		this.hourClose = hourClose;
	}

	/**
	 * @return the locationTz
	 */
	public synchronized String getLocationTz() {
		return locationTz;
	}

	/**
	 * @param locationTz the locationTz to set
	 */
	public synchronized void setLocationTz(String locationTz) {
		this.locationTz = locationTz;
	}

	/**
	 * @return the dateTime
	 */
	public synchronized Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public synchronized void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the dateTimeTz
	 */
	public synchronized String getDateTimeTz() {
		return dateTimeTz;
	}

	/**
	 * @param dateTimeTz the dateTimeTz to set
	 */
	public synchronized void setDateTimeTz(String dateTimeTz) {
		this.dateTimeTz = dateTimeTz;
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
                "Location[id=%d, name='%s', addressId='%d, phoneNbr=%s, daysOpen=%s, hourOpen=%s, hourClose=%s, locationTz=%s, dateTime=%s, dateTimeTz=%s']",
                id, name, addressId, phoneNbr, daysOpen, hourOpen, hourClose, locationTz, dateTime.toString(), dateTimeTz);
    }
    
}
