# Sensores

-ciclo de ejecucion de los metodos:
El auto(observable) agregara a mecanico(observer)
addObserver(Observer o) : es un metodo syncronized de la clase observable
Al realizar un cambio al auto se clona el objeto anterior, se setea los cabios y se notifica a los observadores
El observer(mecanico) sobreescribe el metodo update()

-Los parametros del metodo update son: (Observable o, Object arg)

o : es el objeto observable.
arg : es un argumento pasado al método notifyObservers .

Este método se llama cada vez que se cambia el objeto observado.
Un metodo de un objeto Observable llama al método notifyObservers 
para que todos los observadores del objeto sean notificados del cambio.

El metodo update es utilizado dentro de Mecanico(clase que implementa Observer)