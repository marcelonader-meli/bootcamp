//package br.com.meli.persistence;
//
//import br.com.meli.persistence.entities.AlunoEntity;
//import br.com.meli.persistence.entities.DisciplinaEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class DisciplinaRepository {
//    private static Map<Integer, DisciplinaEntity> disciplinaMap = new HashMap<>();
//    private static Integer idGlobal = 1;
//
//    public DisciplinaEntity salvar(DisciplinaEntity disciplina) {
////        disciplina.setId(idGlobal);
//        disciplinaMap.put(idGlobal++, disciplina);
//        return disciplina;
//    }
//
//    public List<DisciplinaEntity> buscarTodos() {
//        return new ArrayList<>(disciplinaMap.values());
//    }
//}
