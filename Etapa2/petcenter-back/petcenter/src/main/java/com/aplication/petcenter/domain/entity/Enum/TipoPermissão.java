package com.aplication.petcenter.domain.entity.Enum;

import lombok.Getter;

public enum TipoPermissão {

    ADM(0, "Administardor"),
    CLIENTE(1, "Cliente"),
    FUNCIONARIO(2, "Funcionário"),
    RH(3, "Rh");

    @Getter
    private int cod;

    @Getter
    private String desc;

    private TipoPermissão(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public static TipoPermissão toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoPermissão x : TipoPermissão.values())
            if (cod.equals(x.getCod())) {
                return x;
            }
        throw new IllegalAccessError("código inválido" + cod);
    }
}
