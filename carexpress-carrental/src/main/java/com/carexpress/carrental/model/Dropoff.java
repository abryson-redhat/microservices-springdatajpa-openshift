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
@Table(name = "dropoff", schema = "carexpress")
public class Dropoff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8138583769712452280L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
	@Column(name = "dropoff_date", nullable = false)
    private Date dropOffDate;
    
    @Temporal(TemporalType.TIME)
	@Column(name = "dropoff_time", nullable = false)
    private Date dropOffTime;
    
    @Column(name = "dropoff_date", nullable = false)
    private String dropOffTimeTz;
    
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;
    
    @Column(name = "return_location_id", nullable = false)
    private Integer returnLocationId;
    
    @Column(name = "return_agent_id", nullable = false)
    private Integer returnAgentId;
    
	@Column(name = "nbr_of_days", nullable = false, precision = 4, scale = 0)
    private Short nbrOfDays;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", nullable = false, length = 29)
    private Date dateTime;
    
    @Column(name = "date_time_tz", nullable = false)
    private String dateTimeTz;

	/**
	 * @return the dropOffDate
	 */
	public synchronized Date getDropOffDate() {
		return dropOffDate;
	}

	/**
	 * @param dropOffDate the dropOffDate to set
	 */
	public synchronized void setDropOffDate(Date dropOffDate) {
		this.dropOffDate = dropOffDate;
	}

	/**
	 * @return the dropOffTime
	 */
	public synchronized Date getDropOffTime() {
		return dropOffTime;
	}

	/**
	 * @param dropOffTime the dropOffTime to set
	 */
	public synchronized void setDropOffTime(Date dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	/**
	 * @return the dropOffTimeTz
	 */
	public synchronized String getDropOffTimeTz() {
		return dropOffTimeTz;
	}

	/**
	 * @param dropOffTimeTz the dropOffTimeTz to set
	 */
	public synchronized void setDropOffTimeTz(String dropOffTimeTz) {
		this.dropOffTimeTz = dropOffTimeTz;
	}

	/**
	 * @return the customerId
	 */
	public synchronized Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public synchronized void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the returnLocationId
	 */
	public synchronized Integer getReturnLocationId() {
		return returnLocationId;
	}

	/**
	 * @param returnLocationId the returnLocationId to set
	 */
	public synchronized void setReturnLocationId(Integer returnLocationId) {
		this.returnLocationId = returnLocationId;
	}

	/**
	 * @return the returnAgentId
	 */
	public synchronized Integer getReturnAgentId() {
		return returnAgentId;
	}

	/**
	 * @param returnAgentId the returnAgentId to set
	 */
	public synchronized void setReturnAgentId(Integer returnAgentId) {
		this.returnAgentId = returnAgentId;
	}

	/**
	 * @return the nbrOfDays
	 */
	public synchronized Short getNbrOfDays() {
		return nbrOfDays;
	}

	/**
	 * @param nbrOfDays the nbrOfDays to set
	 */
	public synchronized void setNbrOfDays(Short nbrOfDays) {
		this.nbrOfDays = nbrOfDays;
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
                "Dropoff[id=%d, dropOffDate='%s', dropOffTime='%s, dropOffTimeTz=%, customerId=%d, returnLocationId=%d, returnAgentId=%d, nbrOfDays=%d, dateTime=%s, dateTimeTz=%s']",
                id, dropOffDate.toString(), dropOffTime.toString(), dropOffTimeTz, customerId, returnLocationId, returnAgentId, nbrOfDays, dateTime.toString(), dateTimeTz);
    }
}
