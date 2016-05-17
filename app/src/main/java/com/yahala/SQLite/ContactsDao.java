package com.yahala.SQLite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.yahala.SQLite.Contacts;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table CONTACTS.
 */
public class ContactsDao extends AbstractDao<Contacts, Long> {

    public static final String TABLENAME = "CONTACTS";

    /**
     * Properties of entity Contacts.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "uid");
        public final static Property Jid = new Property(1, String.class, "jid", false, "JID");
        public final static Property Fname = new Property(2, String.class, "fname", false, "FNAME");
        public final static Property Sname = new Property(3, String.class, "sname", false, "SNAME");
        public final static Property Avatar = new Property(4, String.class, "avatar", false, "AVATAR");
    }

    ;


    public ContactsDao(DaoConfig config) {
        super(config);
    }

    public ContactsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'CONTACTS' (" + //
                "'uid' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'JID' TEXT," + // 1: jid
                "'FNAME' TEXT," + // 2: fname
                "'SNAME' TEXT," + // 3: sname
                "'AVATAR' TEXT);"); // 4: avatar
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CONTACTS'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, Contacts entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String jid = entity.getJid();
        if (jid != null) {
            stmt.bindString(2, jid);
        }

        String fname = entity.getFname();
        if (fname != null) {
            stmt.bindString(3, fname);
        }

        String sname = entity.getSname();
        if (sname != null) {
            stmt.bindString(4, sname);
        }

        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Contacts readEntity(Cursor cursor, int offset) {
        Contacts entity = new Contacts( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // jid
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // fname
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sname
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // avatar
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, Contacts entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setJid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(Contacts entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(Contacts entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
