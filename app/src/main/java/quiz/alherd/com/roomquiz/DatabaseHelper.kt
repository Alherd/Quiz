package quiz.alherd.com.roomquiz

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, VERSION) {

    companion object {
        const val VERSION = 1
        const val DATABASE_NAME = "clinicBase.db"

        const val TABLE_QUESTIONS = "questions_table"
        const val COLUMN_ID_QUESTION = "question_id"
        const val COLUMN_TEXT_QUESTION = "question_text"

        const val TABLE_ANSWERS = "answers_table"
        const val COLUMN_ID_ANSWER = "answer_id"
        const val COLUMN_TEXT_ANSWER = "answer_text"
        const val COLUMN_ID_QUESTION_ANSWER = "id_question_answer"
        const val COLUMN_ANSWER_RIGHT = "answer_right"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_QUESTIONS ($COLUMN_ID_QUESTION INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_TEXT_QUESTION TEXT);")

        db?.execSQL(
            "CREATE TABLE $TABLE_ANSWERS ($COLUMN_ID_ANSWER INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_TEXT_ANSWER TEXT," +
                    " $COLUMN_ID_QUESTION_ANSWER TEXT, $COLUMN_ANSWER_RIGHT TEXT)"
        )

        db?.execSQL("INSERT INTO $TABLE_QUESTIONS ($COLUMN_TEXT_QUESTION) VALUES ('India'), ('Germany');")

        db?.execSQL(
            "INSERT INTO $TABLE_ANSWERS ($COLUMN_TEXT_ANSWER, $COLUMN_ID_QUESTION_ANSWER, $COLUMN_ANSWER_RIGHT) VALUES " +
                    "('Delhi', '1', '0'), ('New Delhi', 1, '1'), ('Berlin', '2', '1'), ('Koln', '2', '0');"
        )

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        onCreate(db)
    }

}