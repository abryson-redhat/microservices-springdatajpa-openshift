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
@Table(name = "agent", schema = "carexpress")
public class Agent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8288409394829248150L;


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
    
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;

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
                "Agent[id=%d, firstName='%s', middleName='%s, lastName=%s, prefix=%s, suffix=%s, dateTime=%s, dateTimeTz=%s']",
                id, firstName, middleName, lastName, prefix, suffix, dateTime.toString(), dateTimeTz);
    }
    
}
