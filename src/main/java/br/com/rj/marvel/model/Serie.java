package br.com.rj.marvel.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_serie")
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer available;

	private Integer returned;

	@Transient
	private String collectionURI;

	@OneToMany
	@JoinColumn(name = "id_serie")
	private List<SerieSummary> items;

	public Integer getId() {
		return id;
	}

	public Integer getAvailable() {
		return available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Integer getReturned() {
		return returned;
	}

	public void setReturned(Integer returned) {
		this.returned = returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	public List<SerieSummary> getItems() {
		return items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
