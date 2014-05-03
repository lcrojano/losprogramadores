<article >
    <header><h3>Ingresar Solicitud</h3></header>
    <div>
        <fieldset >
            <?php echo $this->Form->create('Student', array('action' => 'add'));  ?>
            <?php echo $this->Form->input("user_id", array('type' => 'hidden',
               'value' => $this->Session->read('Auth.User.id')));?>
            <?php echo $this->Form->input('id', array('type' => 'text','label' => 'Codigo'));  ?>
            <?php echo $this->Form->input('primer_nombre',  array('type' => 'text'));  ?>
            <?php echo $this->Form->input('segundo_nombre',  array('type' => 'text'));  ?>
            <?php echo $this->Form->input('apellido', array('type' => 'text'));  ?>
            <?php echo $this->Form->input('desc_programa', array(
                'label' => 'Programa',  
                'options' =>$list)); ?>
            
            <?php echo $this->Form->input('email',  array('type' => 'text'));  ?>
            
       </fieldset>
         </div>
        <footer>	
        <div class="submit_link">
            <?php
            echo $this->Form->end(array('div' => false,
                'label' => 'Ingresar nuevo Estudiante',
                'class' => 'alt_btn'
            ));
            ?>
            
        </div>
    </footer>
</article><!-- end of post new article -->
     