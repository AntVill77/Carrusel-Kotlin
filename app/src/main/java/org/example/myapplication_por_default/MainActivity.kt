package org.example.myapplication_por_default

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselOnScrollListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://images.mediotiempo.com/dg27po8DUwPbHq3Ad91DT__12lQ=/0x530/uploads/media/2019/11/10/fotos-noa-saez-instagram-mujeres-17.jpg", "M1"))
        list.add(CarouselItem("https://www.quever.news/u/fotografias/m/2020/10/11/f638x638-1905_60072_5037.jpg", "M2"))
        list.add(CarouselItem("https://cdn2.mediotiempo.com/uploads/media/2019/11/10/fotos-noa-saez-instagram-mujeres-18.jpg", "M3"))

        carousel.addData(list)

      /*  carousel.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onClick(position: Int, carouselItem: CarouselItem){
                Toast.makeText(this@MainActivity,"Auto ${carouselItem.caption}",Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem){

            }*/

       // }
    }
}