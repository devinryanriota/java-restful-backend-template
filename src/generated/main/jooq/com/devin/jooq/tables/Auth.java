/*
 * This file is generated by jOOQ.
 */
package com.devin.jooq.tables;


import com.devin.jooq.Fdr;
import com.devin.jooq.Keys;
import com.devin.jooq.tables.records.AuthRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Auth extends TableImpl<AuthRecord> {

    private static final long serialVersionUID = 650999558;

    /**
     * The reference instance of <code>fdr.auth</code>
     */
    public static final Auth AUTH = new Auth();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthRecord> getRecordType() {
        return AuthRecord.class;
    }

    /**
     * The column <code>fdr.auth.email</code>.
     */
    public final TableField<AuthRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>fdr.auth.salt</code>.
     */
    public final TableField<AuthRecord, String> SALT = createField(DSL.name("salt"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>fdr.auth.password</code>.
     */
    public final TableField<AuthRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>fdr.auth.created_at</code>.
     */
    public final TableField<AuthRecord, OffsetDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>fdr.auth.created_by</code>.
     */
    public final TableField<AuthRecord, String> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).defaultValue(org.jooq.impl.DSL.field("'postgres'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>fdr.auth.last_modified_at</code>.
     */
    public final TableField<AuthRecord, OffsetDateTime> LAST_MODIFIED_AT = createField(DSL.name("last_modified_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>fdr.auth.last_modified_by</code>.
     */
    public final TableField<AuthRecord, String> LAST_MODIFIED_BY = createField(DSL.name("last_modified_by"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).defaultValue(org.jooq.impl.DSL.field("'postgres'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>fdr.auth</code> table reference
     */
    public Auth() {
        this(DSL.name("auth"), null);
    }

    /**
     * Create an aliased <code>fdr.auth</code> table reference
     */
    public Auth(String alias) {
        this(DSL.name(alias), AUTH);
    }

    /**
     * Create an aliased <code>fdr.auth</code> table reference
     */
    public Auth(Name alias) {
        this(alias, AUTH);
    }

    private Auth(Name alias, Table<AuthRecord> aliased) {
        this(alias, aliased, null);
    }

    private Auth(Name alias, Table<AuthRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Auth(Table<O> child, ForeignKey<O, AuthRecord> key) {
        super(child, key, AUTH);
    }

    @Override
    public Schema getSchema() {
        return Fdr.FDR;
    }

    @Override
    public UniqueKey<AuthRecord> getPrimaryKey() {
        return Keys.PK_USER_EMAIL;
    }

    @Override
    public List<UniqueKey<AuthRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthRecord>>asList(Keys.PK_USER_EMAIL);
    }

    @Override
    public Auth as(String alias) {
        return new Auth(DSL.name(alias), this);
    }

    @Override
    public Auth as(Name alias) {
        return new Auth(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Auth rename(String name) {
        return new Auth(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Auth rename(Name name) {
        return new Auth(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, OffsetDateTime, String, OffsetDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
