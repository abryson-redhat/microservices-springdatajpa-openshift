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
@Table(name = "customer", schema = "carexpress")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6346677356170316840L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
  
    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "middle_name", nullable = false)
    private String middleName;
    
    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Column(name = "prefix", nullable = false)
    private String prefix;
    
    @Column(name = "suffix", nullable = false)
    private String suffix;
    
    @Column(name = "level", nullable = false)
    private String level;
    
    @Column(name = "phone_nbr", nullable = false)
    private String phoneNbr;
    
    @Column(name = "address_id", nullable = false)
    private Integer addressId;
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;
    
    



	/**
	 * @return the id
	 */
	public synchronized Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public synchronized void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the firstName
	 */
	public synchronized String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public synchronized void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the middleName
	 */
	public synchronized String getMiddleName() {
		return middleName;
	}


	/**
	 * @param middleName the middleName to set
	 */
	public synchronized void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	/**
	 * @return the lastName
	 */
	public synchronized String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public synchronized void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the prefix
	 */
	public synchronized String getPrefix() {
		return prefix;
	}


	/**
	 * @param prefix the prefix to set
	 */
	public synchronized void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	/**
	 * @return the suffix
	 */
	public synchronized String getSuffix() {
		return suffix;
	}


	/**
	 * @param suffix the suffix to set
	 */
	public synchronized void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	/**
	 * @return the level
	 */
	public synchronized String getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public synchronized void setLevel(String level) {
		this.level = level;
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
    
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', middleName='%s, lastName=%s, prefix=%s, suffix=%s, level=%s, phoneNbr=%s, addressId=%d, dateTime=%s, dateTimeTz=%s']",
                id, firstName, middleName, lastName, prefix, suffix, level, phoneNbr, addressId, dateTime.toString(), dateTimeTz);
    }
	
}
