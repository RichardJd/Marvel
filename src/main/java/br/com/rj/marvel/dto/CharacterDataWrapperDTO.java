package br.com.rj.marvel.dto;

public class CharacterDataWrapperDTO {

	private Integer code;
	private String status;
	private String copyright;
	private String attributionText;
	private String attributionHTML;
	private CharacterDataContainerDTO data;
	private String etag;

	public CharacterDataWrapperDTO() {
		copyright = "© 2020 MARVEL";
		attributionText = "Data provided by Marvel. © 2020 MARVEL";
		attributionHTML = "<a href=\"http://marvel.com\">Data provided by Marvel. © 2020 MARVEL</a>";
		data = new CharacterDataContainerDTO();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CharacterDataContainerDTO getData() {
		return data;
	}

	public void setData(CharacterDataContainerDTO data) {
		this.data = data;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getCopyright() {
		return copyright;
	}

	public String getAttributionText() {
		return attributionText;
	}

	public String getAttributionHTML() {
		return attributionHTML;
	}
}
