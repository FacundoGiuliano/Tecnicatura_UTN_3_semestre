class Cliente extends Persona{
    static contadorCLientes=0;
    constructor(nombre,apellido,edad,fecharegistro){
        super(nombre,apellido,edad);
        this._idCLiente=++Cliente.contadorCLientes;
        this._fecharegistro=fecharegistro;
    }
    get idCLiente(){
        return this._idCLiente;
    }
    get fecharegistro(){
        return this._fecharegistro;
    }
    set fecharegistro(fecharegistro){
        this._fecharegistro=fecharegistro;
    }
    toString(){
        return `
        ${super.toString()} 
        ${this._idCLiente} 
        ${this._fecharegistro}`;
    }
}