KOD ÇIKTISI

just for
any not more 
It's breakfast 
!

FLOW

1. main metodu çalışır, bizz=5, buzz=2.
2. zoop("just for", 5) çağrılır (1. zoop çağrısı). Ekrana just for yazılır.
3. bob 5 olduğu için ping çağrılır. Ekrana any not more  yazılır.
4. main'e dönülür. clink(2 * buzz) yani clink(4) çağrılır.
5. clink içinde ekrana It's  yazılır (alt satıra geçmez).
6. clink içinden zoop("breakfast ", 4) çağrılır (2. zoop çağrısı). Ekrana breakfast  yazılır (önceki "It's " ile aynı satırda görünür).
7. bob 4 olduğu için (5 olmadığı için) else bloğu çalışır ve ekrana ! yazılır.


STACK DİAGRAM

graph BT
    %% Stack Diyagramı - zoop ikinci kez çağrıldığında
    subgraph "Stack (Yığın)"
        subgraph "main Frame"
            args("args: [ ]")
            bizz("bizz: 5")
            buzz("buzz: 2")
        end
        subgraph "clink Frame"
            fork("fork: 4")
        end
        subgraph "zoop Frame (Aktif)"
            fred("fred: \"breakfast \"")
            bob("bob: 4")
        end
    end

    %% Çağrı İlişkileri
    "main Frame" --> "clink Frame"
    "clink Frame" --> "zoop Frame (Aktif)"

    %% Stiller
    style "zoop Frame (Aktif)" fill:#ffcccc,stroke:#ff0000,stroke-width:2px
