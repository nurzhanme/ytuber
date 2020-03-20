package pro.nait.ytuber

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ytuber")
class YtuberController(private val service: YtuberService)  {

    @GetMapping("/download")
    fun download(vId: String): String {
        val link = "https://www.youtube.com/watch?v=" + vId
        service.Download(link)

        return "Hello, World"
    }
}