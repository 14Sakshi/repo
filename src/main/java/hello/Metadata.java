package hello;

public class Metadata {
	String intentId;
	boolean webhookUsed;
    boolean webhookForSlotFillingUsed;
    int webhookResponseTime;
    String intentName;
	public String getIntentId() {
		return intentId;
	}
	public void setIntentId(String intentId) {
		this.intentId = intentId;
	}
	public boolean isWebhookUsed() {
		return webhookUsed;
	}
	public void setWebhookUsed(boolean webhookUsed) {
		this.webhookUsed = webhookUsed;
	}
	public boolean isWebhookForSlotFillingUsed() {
		return webhookForSlotFillingUsed;
	}
	public void setWebhookForSlotFillingUsed(boolean webhookForSlotFillingUsed) {
		this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
	}
	public int getWebhookResponseTime() {
		return webhookResponseTime;
	}
	public void setWebhookResponseTime(int webhookResponseTime) {
		this.webhookResponseTime = webhookResponseTime;
	}
	public String getIntentName() {
		return intentName;
	}
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}
    
}
