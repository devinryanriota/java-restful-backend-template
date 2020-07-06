/*
 * This file is generated by jOOQ.
 */
package com.devin.jooq;


import com.devin.jooq.tables.Auth;
import com.devin.jooq.tables.Users;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fdr extends SchemaImpl {

    private static final long serialVersionUID = -2018196502;

    /**
     * The reference instance of <code>fdr</code>
     */
    public static final Fdr FDR = new Fdr();

    /**
     * The table <code>fdr.auth</code>.
     */
    public final Auth AUTH = Auth.AUTH;

    /**
     * The table <code>fdr.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Fdr() {
        super("fdr", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Auth.AUTH,
            Users.USERS);
    }
}
