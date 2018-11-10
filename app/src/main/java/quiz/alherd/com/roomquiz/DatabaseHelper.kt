package quiz.alherd.com.roomquiz

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, VERSION) {

    companion object {
        val VERSION = 1
        val DATABASE_NAME = "clinicBase.db"
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}