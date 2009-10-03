package net.sf.egonet.model;

/**
 * Value object representing an item of a drop-down, listbox, or similar widget
 */
public class QuestionOption extends Entity
{
	private Long questionId;
	private String name;
	
	private Integer ordering;

	public QuestionOption(Long questionId, String name)
	{
		this.questionId = questionId;
		this.name = name;
	}
	
	public String toString() {
		return name == null || name.isEmpty() ? "<unnamed option>" : name;
	}

	public Long   getQuestionId() { return questionId; }
	public String getName()       { return name;       }

	public Integer getOrdering() { return ordering; }
	public void setOrdering(Integer ordering) { this.ordering = ordering; }
	
	// For Hibernate use only -----------------

	protected QuestionOption() {}

	protected void setQuestionId(Long val) { this.questionId = val; }
	protected void setName(String val)     { this.name       = val; }
}