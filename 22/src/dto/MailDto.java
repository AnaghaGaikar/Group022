package dto;

public class MailDto {

	private String recipientEmail="abc@xyz.com,ank@son.com";
	private String subject;
	private String content;
	public MailDto() {
		super();
	}
	
	public String getRecipientEmail() {
		return recipientEmail;
	}

	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
