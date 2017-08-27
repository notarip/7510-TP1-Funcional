# 7510-TP1-Funcional

## Enunciado  
### Implementación​ ​ de​ ​ un​ ​ intérprete​ ​ lógico​ ​ por​ ​ substitución 
En​ ​ el​ ​ ámbito​ ​ de​ ​ la​ ​ programación​ ​ lógica​ ​ los​ ​ sistemas​ ​ tienen​ ​ una​ ​ estructura​ ​ que​ ​ está
dada​ ​ por​ ​ : ​ ​ una​ ​ base​ ​ de​ ​ datos​ ​ - ​ ​ conformada​ ​ por​ ​ definiciones​ ​ (facts)​ ​ y ​ ​ reglas​ ​ - ​ ​ más​ ​ un​ ​ intérprete
que​ ​ acepta​ ​ consultas​ ​ y ​ ​ las​ ​ responde​ ​ extrayendo​ ​ información​ ​ y ​ ​ operando​ ​ sobre​ ​ la​ ​ base​ ​ de
datos.
Se​ ​ pide​ ​ desarrollar:​ ​ ​ un​ ​ intérprete​ ​ que,​ ​ frente​ ​ a ​ ​ consultas​ ​ con​ ​ todos​ ​ los​ ​ parámetros
instanciados,​ ​ responda​ ​ afirmativamente​ ​ o ​ ​ negativamente​ ​ a ​ ​ dichas​ ​ preguntas.
Las​ ​ reglas​ ​ deben​ ​ leerse​ ​ como​ ​ una​ ​ relación​ ​ de​ ​ implicación​ ​ lógica,​ ​ es​ ​ decir​ ​ que​ ​ si​ ​ se
cumplen​ ​ los​ ​ objetivos​ ​ de​ ​ la​ ​ derecha​ ​ del​ ​ operador​ ​ :-​ ​ , ​ ​ se​ ​ cumple​ ​ el​ ​ objetivo​ ​ de​ ​ la​ ​ izquierda​ ​ y ​ ​ en
definitiva​ ​ la​ ​ consulta​ ​ tiene​ ​ como​ ​ respuesta​ ​ SI,​ ​ de​ ​ lo​ ​ contrario​ ​ la​ ​ respuesta​ ​ es​ ​ NO.​ ​ Las​ ​ letras
mayúsculas​ ​ indican​ ​ variables​ ​ sin​ ​ instanciar​ . ​ ​ Las​ ​ variables​ ​ son​ ​ sólo​ ​ válidas​ ​ dentro​ ​ de​ ​ una​ ​ regla,
por​ ​ lo​ ​ cual​ ​ si​ ​ aparecen​ ​ en​ ​ más​ ​ de​ ​ una​ ​ regla​ ​ representan​ ​ ítems​ ​ diferentes​ ​ aunque​ ​ tengan​ ​ igual
nombre.
Para​ ​ acotar​ ​ el​ ​ alcance​ ​ del​ ​ problema​ ​ las​ ​ reglas​ ​ serán​ ​ compuestas​ ​ solamente​ ​ por
conjunción​ ​ de​ ​ facts​ ​ indicados​ ​ por​ ​ comas​ ​ y ​ ​ debe​ ​ tomarse​ ​ a ​ ​ los​ ​ objetivos​ ​ (facts​ ​ que​ ​ componen​ ​ a
las​ ​ reglas)​ ​ como​ ​ definiciones​ ​ con​ ​ sus​ ​ parámetros​ ​ sin​ ​ instanciar.
Se​ ​ pide​ ​ implementarlo​ ​ utilizando​ ​ programación​ ​ funcional

#### Ejemplo​ ​ de​ ​ base​ ​ de​ ​ datos​ ​ con​ ​ definiciones​ ​ y ​ ​ dos​ ​ reglas.
varon(juan).
varon(pepe).
varon(hector).
varon(roberto).
varon(alejandro).
mujer(maria).
mujer(cecilia).
padre(juan,​ ​ pepe).
padre(juan,​ ​ pepa).
padre(hector,​ ​ maria).
padre(roberto,​ ​ alejandro).
padre(roberto,​ ​ cecilia).
hijo(X,​ ​ Y)​ ​ :-​ ​ varon(X),​ ​ padre(Y,​ ​ X).
hija(X,​ ​ Y)​ ​ :-​ ​ mujer(X),​ ​ padre(Y,​ ​ X).

#### Ejemplo​ ​ de​ ​ uso

padre(juan,​ ​ pepe)​ ​ → ​ ​ SI
padre(mario,​ ​ pepe)​ ​ → ​ ​ NO
hijo(pepe,​ ​ juan)​ ​ → ​ ​ SI
hija(maria,​ ​ roberto)​ ​ → ​ ​ NO
El​ ​ sistema​ ​ debe​ ​ tomar​ ​ la​ ​ base​ ​ de​ ​ datos​ ​ desde​ ​ un​ ​ archivo​ ​ de​ ​ texto​ ​ y ​ ​ poder​ ​ responder​ ​ las
consultas​ ​ ingresadas​ ​ por​ ​ consola.

#### Restricciones 
- Tp​ ​ individual
- Implementado​ ​ en​ ​ Clojure
- Implementado​ ​ con​ ​ Test​ ​ Unitarios
- Utilización​ ​ de​ ​ repositorio​ ​ Git​ ​ en​ ​ la​ ​ cuenta​ ​ informada​ ​ de​ ​ Github

#### Fecha​ ​ de​ ​ Entrega 
- Fecha​ ​ de​ ​ Entrega:​ ​ Antes​ ​ del​ ​ Lunes​ ​ 11​ ​ de​ ​ Septiembre​ ​ 20hs​ ​ via​ ​ Github
- Crear​ ​ y ​ ​ trabajar​ ​ sobre​ ​ un​ ​ repositorio​ ​ llamado​ ​ 7510-TP1-Funcional
- Etiquetar​ ​ en​ ​ el​ ​ github​ ​ personal​ ​ la​ ​ entrega​ ​ como:​ ​ entregaTP1
