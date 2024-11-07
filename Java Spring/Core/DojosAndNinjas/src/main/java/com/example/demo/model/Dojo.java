package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="dojos")
public class Dojo {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	@NotNull
	 	@NotEmpty
	    private String name;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
	    private List<Ninja> ninjas;
	    
	    public Dojo() {
	        
	    }

		public Dojo(Long id, String name, Date createdAt, Date updatedAt, List<Ninja> ninjas) {
			super();
			this.id = id;
			this.name = name;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.ninjas = ninjas;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		public List<Ninja> getNinjas() {
			return ninjas;
		}

		public void setNinjas(List<Ninja> ninjas) {
			this.ninjas = ninjas;
		}
}
