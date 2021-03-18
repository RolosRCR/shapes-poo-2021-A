<div hidden>
```
@startuml firstDiagram

title Shapes - Class Diagram


class Shape {
+Int Windows
+void Lock()
}

class Circle extends Shape
class Triangle extends Shape
class Square extends Shape

class Equilatero extends Triangle

@enduml
</div>

![](firstDiagram.svg)