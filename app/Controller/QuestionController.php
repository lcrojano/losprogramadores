<?php

class QuestionController extends AppController {
   
    public $name = 'Questions';
    public $paginate = array(
        'fields' => array(
            'Question.question',
            'Question.tag_id',
            'Question.id',
			)
    );
   
 
           

    /**
     *  El AuthComponent proporciona la funcionalidad necesaria
     *  para el acceso (login), por lo que se puede dejar esta función en blanco.
     */
    
   
    
   
    function index() {
       
       
       // $this->set('questions', $this->Question->find('all'));
    }
   

}

?>
