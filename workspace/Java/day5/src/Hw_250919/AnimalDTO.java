package Hw_250919;

public class AnimalDTO {
	private String id ;
	private String protector;
	private String ani_name;
	private int ani_age;
	private String contact;
	
	
	public AnimalDTO() { }

	public AnimalDTO(String id, String protector, String ani_name, int ani_age, String contact) {
		this.id = id;
		this.protector = protector;
		this.ani_name = ani_name;
		this.ani_age = ani_age;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProtector() {
		return protector;
	}

	public void setProtector(String protector) {
		this.protector = protector;
	}

	public String getAni_name() {
		return ani_name;
	}

	public void setAni_name(String ani_name) {
		this.ani_name = ani_name;
	}

	public int getAni_age() {
		return ani_age;
	}

	public void setAni_age(int ani_age) {
		this.ani_age = ani_age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "AnimalDTO [id=" + id + ", protector=" + protector + ", ani_name=" + ani_name + ", ani_age=" + ani_age
				+ ", contact=" + contact + "]";
	}
}
