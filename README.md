# Taller de patrones de diseño y UML

## Objetivo
Identificar patrones de diseño aplicables
dentro del escenario que se presentado y elaborar un diseño utilizando diagramas de clases y de secuencia en UML.

## Escenario
Considere una empresa, con alcance a nivel nacional, de venta de artículos de tecnología - de computación,
impresión, televisión, video, celulares, tabletas, entre otros. Todos estos productos se almacenan en las
bodegas de las tiendas a nivel nacional. El software debe permitir que diversos actores puedan conocer el
inventario de un producto dependiendo de su necesidad específica. Por ejemplo, a un comprador Web le
interesa navegar a través de productos disponibles; al vendedor de una tienda, navegar entre productos
disponibles en su tienda; a un proveedor, navegar entre productos que han presentado fallas dentro del
periodo de garantía; al asistente de mantenimiento, navegar entre productos en reparación, etc.

El departamento de logística de la empresa distribuye los artículos entre sus tiendas a nivel nacional.
Actualmente, transporta sus artículos únicamente por vía automotriz; sin embargo, en un futuro cercano
podría empezar su distribución también por vía ciclista, férrea, aérea y fluvial. Las estrategias de distribución
son intercambiables y seleccionadas en tiempo de ejecución.

En caso de inconformidad con algún artículo por parte de un comprador, este se puede acercar a la tienda
a solicitar un cambio. Primero un asistente del departamento de atención al usuario debe verificar que el
producto se encuentra en periodo de garantía; si es así, un miembro del departamento técnico constatará
que el tipo de fallo se encuentre dentro de lo cubierto por la garantía; a continuación, el jefe de inventario
debe certificar la existencia del producto en bodega para reposición. Si el precio de venta del producto
supera los 1000 USD, se requiere además la aprobación del gerente de la tienda. Los responsables de las
actividades podrían cambiar en cualquier momento y el software debería ser lo suficientemente flexible
para lidiar con ello.

## Diagramas UML de los patrones aplicados