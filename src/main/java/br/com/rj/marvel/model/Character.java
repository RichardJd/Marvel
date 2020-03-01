package br.com.rj.marvel.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_character")
public class Character {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Size(max = 60)
	private String name;

	@Size(max = 255)
	private String description;

	private LocalDate modified;

	@Transient
	private String resourceURI;

	@OneToMany
	@JoinColumn(name = "id_character")
	private List<Url> urls;

	@OneToOne
	@JoinColumn(name = "id_image")
	private Image thumbnall;

	@OneToOne
	@JoinColumn(name = "id_comic")
	private Comic comics;

	@OneToOne
	@JoinColumn(name = "id_story")
	private Story stories;

	@OneToOne
	@JoinColumn(name = "id_event")
	private Event events;
	
	@OneToOne
	@JoinColumn(name = "id_serie")
	private Serie series;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getModified() {
		return modified;
	}

	public void setModified(LocalDate modified) {
		this.modified = modified;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public Image getThumbnall() {
		return thumbnall;
	}

	public void setThumbnall(Image thumbnall) {
		this.thumbnall = thumbnall;
	}

	public Comic getComics() {
		return comics;
	}

	public void setComics(Comic comics) {
		this.comics = comics;
	}

	public Story getStories() {
		return stories;
	}

	public void setStories(Story stories) {
		this.stories = stories;
	}

	public Event getEvents() {
		return events;
	}

	public void setEvents(Event events) {
		this.events = events;
	}

	public Serie getSeries() {
		return series;
	}

	public void setSeries(Serie series) {
		this.series = series;
	}

	public List<Url> getUrls() {
		return urls;
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
		Character other = (Character) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
