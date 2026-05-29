<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class GameController extends Controller
{
    public function search($gameName) {
        return "Procurando pelo jogo:" . $gameName;
    }
}
