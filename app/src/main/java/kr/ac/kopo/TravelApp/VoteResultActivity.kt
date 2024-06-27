package kr.ac.kopo.TravelApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class VoteResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_result)
        var intent = intent

        var imgName = intent.getStringArrayExtra("imgName");
        var voteCount = intent.getIntArrayExtra("voteCount");

        var text = arrayOfNulls<TextView>(imgName!!.size)
        var ratingBar = arrayOfNulls<RatingBar>(imgName!!.size)

        var textId = arrayOf(R.id.country01, R.id.country02, R.id.country03, R.id.country04)
        var ratingBarId = arrayOf(R.id.r1, R.id.r2, R.id.r3, R.id.r4)

        for (i in textId!!.indices){
            text[i] = findViewById<TextView>(textId[i])
            ratingBar[i] = findViewById<RatingBar>(ratingBarId[i])
            text[i]!!.setText(imgName[i])
            ratingBar[i]!!.rating = voteCount!![i].toFloat()
        }

        var homeBtn = findViewById<Button>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            finish()
        }
    }
}