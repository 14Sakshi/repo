package hello;

public class Result {
	
	String source;
	String resolvedQuery;
	String action;
	String actionIncomplete;
	String parameters;
	String[] contexts;
	Metadata metadata;
	FullFillment fullfillment;
	Messages messages;
	String score;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getResolvedQuery() {
		return resolvedQuery;
	}
	public void setResolvedQuery(String resolvedQuery) {
		this.resolvedQuery = resolvedQuery;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getActionIncomplete() {
		return actionIncomplete;
	}
	public void setActionIncomplete(String actionIncomplete) {
		this.actionIncomplete = actionIncomplete;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String[] getContexts() {
		return contexts;
	}
	public void setContexts(String[] contexts) {
		this.contexts = contexts;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public FullFillment getFullfillment() {
		return fullfillment;
	}
	public void setFullfillment(FullFillment fullfillment) {
		this.fullfillment = fullfillment;
	}
	public Messages getMessages() {
		return messages;
	}
	public void setMessages(Messages messages) {
		this.messages = messages;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	public String toString(){
		return getSource();
	}//toString
	

}
