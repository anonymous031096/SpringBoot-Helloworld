package org.duc.conceptualbank.entity;
// Generated Feb 7, 2018 5:37:51 PM by Hibernate Tools 5.2.8.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * AccountType generated by hbm2java
 */
@Entity
@Table(name = "account_type", catalog = "conceptual_bank")
public class AccountType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer accountTypeCode;
	private String accountTypeDescription;
	private Set<Accounts> accountses = new HashSet<Accounts>(0);

	public AccountType() {
	}

	public AccountType(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}

	public AccountType(String accountTypeDescription, Set<Accounts> accountses) {
		this.accountTypeDescription = accountTypeDescription;
		this.accountses = accountses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "account_type_code", unique = true, nullable = false)
	public Integer getAccountTypeCode() {
		return this.accountTypeCode;
	}

	public void setAccountTypeCode(Integer accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}

	@Column(name = "account_type_description", nullable = false, length = 45)
	public String getAccountTypeDescription() {
		return this.accountTypeDescription;
	}

	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountType", cascade = CascadeType.ALL)
	@JsonIgnore
	public Set<Accounts> getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set<Accounts> accountses) {
		this.accountses = accountses;
	}

	public String toString() {
		return "Account type code: " + accountTypeCode + "\tAccount type description: " + accountTypeDescription;
	}
}
