/**
 * This class is generated by jOOQ
 */
package com.sivalabs.demo.jooq.domain.tables.records;


import com.sivalabs.demo.jooq.domain.tables.Comments;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentsRecord extends UpdatableRecordImpl<CommentsRecord> implements Record6<Integer, Integer, String, String, String, Timestamp> {

	private static final long serialVersionUID = -956268737;

	/**
	 * Setter for <code>PUBLIC.COMMENTS.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.COMMENTS.POST_ID</code>.
	 */
	public void setPostId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.POST_ID</code>.
	 */
	public Integer getPostId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.COMMENTS.NAME</code>.
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.COMMENTS.EMAIL</code>.
	 */
	public void setEmail(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.EMAIL</code>.
	 */
	public String getEmail() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.COMMENTS.CONTENT</code>.
	 */
	public void setContent(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.CONTENT</code>.
	 */
	public String getContent() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.COMMENTS.CREATED_ON</code>.
	 */
	public void setCreatedOn(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.COMMENTS.CREATED_ON</code>.
	 */
	public Timestamp getCreatedOn() {
		return (Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, String, String, Timestamp> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, String, String, Timestamp> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Comments.COMMENTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Comments.COMMENTS.POST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Comments.COMMENTS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Comments.COMMENTS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Comments.COMMENTS.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return Comments.COMMENTS.CREATED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getPostId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreatedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value2(Integer value) {
		setPostId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value4(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value5(String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value6(Timestamp value) {
		setCreatedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CommentsRecord
	 */
	public CommentsRecord() {
		super(Comments.COMMENTS);
	}

	/**
	 * Create a detached, initialised CommentsRecord
	 */
	public CommentsRecord(Integer id, Integer postId, String name, String email, String content, Timestamp createdOn) {
		super(Comments.COMMENTS);

		setValue(0, id);
		setValue(1, postId);
		setValue(2, name);
		setValue(3, email);
		setValue(4, content);
		setValue(5, createdOn);
	}
}
