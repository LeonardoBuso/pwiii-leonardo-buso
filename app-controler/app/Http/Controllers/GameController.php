<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;

class GameController extends Controller
{
    public function index()  {
        $games = ["Zelda", "LOL", "Fortnite"];

        return view('lista_games', ['games' => $games]);
    }

    public function show($id) {
        return "Procurando pelo jogo: " . $id;
    }
}
