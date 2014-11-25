Chart
=====

Gerador de gráficos baseado no highcharts.

Este projeto tem como objetivo fornecer um componente JSF capaz de gerar gráficos baseado no highcharts.js.
Os gráficos fornecidos por essa API podem ser encontrados no seguinte site: http://www.highcharts.com/.

Estrutura do projeto:

src/
└── main
    └── java
        ├── com
        │   └── highcharts
        │       ├── builders
        │       │   ├── ColumnChartBuilder.java
        │       │   └── PieChartBuilder.java
        │       ├── chart
        │       │   ├── AbstractChart.java
        │       │   ├── area
        │       │   │   ├── AreaChart.java
        │       │   │   └── opt
        │       │   │       ├── AreaOptions.java
        │       │   │       ├── Hover.java
        │       │   │       ├── Marker.java
        │       │   │       ├── States.java
        │       │   │       ├── XAxis.java
        │       │   │       └── YAxis.java
        │       │   ├── column
        │       │   │   ├── ColumnChart.java
        │       │   │   └── opt
        │       │   │       ├── ColumnOptions.java
        │       │   │       ├── XAxis.java
        │       │   │       └── YAxis.java
        │       │   ├── ComplexChart.java
        │       │   └── pie
        │       │       ├── Explode.java
        │       │       ├── opt
        │       │       │   └── PieOptions.java
        │       │       └── PieChart.java
        │       ├── Chart.java
        │       ├── component
        │       │   ├── AreaComponent.java
        │       │   ├── ChartComponent.java
        │       │   ├── ColumnComponent.java
        │       │   └── PieComponent.java
        │       ├── Label.java
        │       ├── Legend.java
        │       ├── opt
        │       │   ├── Credits.java
        │       │   ├── LabelOptions.java
        │       │   ├── Options3d.java
        │       │   └── PlotOptions.java
        │       ├── serie
        │       │   ├── PieSerie.java
        │       │   └── Serie.java
        │       ├── TitleChart.java
        │       ├── Title.java
        │       └── TooltipChart.java
        └── META-INF
            ├── faces-config.xml
            ├── notechart-ch.taglib.xml
            └── resources
                └── note
                    ├── css
                    │   └── chart.css
                    └── js
                        ├── chart-conf.js
                        ├── Chart.js
                        ├── highcharts.js
                        └── teste.js

