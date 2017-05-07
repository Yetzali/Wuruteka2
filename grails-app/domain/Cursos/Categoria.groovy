package Cursos

class Categoria {


    String name
    String is_activo
    Categoria id_padre

    static hasMany = [curso: Curso]
    static constraints = {


        nombre(nullable:false)
        is_activo inList: ['activo','desactivado']
        id_padre(nullable:true)
    }


}
