package br.com.renatogallis.games.Controller

import br.com.renatogallis.games.Model.Game
import br.com.renatogallis.games.Service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin // chamada via javascript
@RequestMapping (value = "/game") // mapear o tipo game
class GameController {
    @Autowired
    lateinit var gameservice: GameServices

    @GetMapping
    fun buscarTodos() : List<Game> {

        return  gameservice.buscarTodos()
    }

    @PostMapping
    fun salvar (@RequestBody game: Game){
        gameservice.salvar(game)
    }


    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo")titulo: String): List<Game>{
        return gameservice.buscarPor(nome = titulo)
    }

    @DeleteMapping(value = "{id}")
    fun  apagar(@PathVariable(value =  "id") id: String){

        gameservice.apagarPor(id)
    }
}