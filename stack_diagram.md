graph BT
    %% Stack Diyagramı - Exercise4_3 ping ilk çağrıldığında
    subgraph "Stack (Yığın)"
        subgraph "main Frame"
            args_main("args: [ ]")
        end
        subgraph "zoop Frame"
            %% Parametre veya yerel değişken yok
            empty_zoop(" ")
        end
        subgraph "baffle Frame"
             %% Parametre veya yerel değişken yok
             empty_baffle(" ")
        end
        subgraph "ping Frame (Aktif)"
             %% Parametre veya yerel değişken yok
             empty_ping(" ")
        end
    end

    %% Çağrı ilişkileri
    "main Frame" --> "zoop Frame"
    "zoop Frame" --> "baffle Frame"
    "baffle Frame" --> "ping Frame (Aktif)"

    %% Stiller
    style "ping Frame (Aktif)" fill:#ffcccc,stroke:#ff0000,stroke-width:2px
    style empty_zoop fill:none,stroke:none
    style empty_baffle fill:none,stroke:none
    style empty_ping fill:none,stroke:none
