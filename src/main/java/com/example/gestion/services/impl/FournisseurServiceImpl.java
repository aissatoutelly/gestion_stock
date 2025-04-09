package com.example.gestion.services;
import com.example.gestion.dto.FournisseurDto;
import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.models.Fournisseur;
import com.example.gestion.repository.FournisseurRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FournisseurServiceImpl implements FournisseurService {
    private final FournisseurRepository fournisseurRepository;

    public FournisseurServiceImpl(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    @Override
    public FournisseurDto save(FournisseurDto dto) {
        Fournisseur saveFournisseur = fournisseurRepository.save(FournisseurDto.toEntity(dto));
        return FournisseurDto.fromEntity(saveFournisseur);
    }

    @Override
    public FournisseurDto findById(Integer id) {
        return null;
    }

    @Override
    public List<FournisseurDto> findAll() {
        return fournisseurRepository.findAll().stream()
                .map(FournisseurDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public FournisseurDto modify(FournisseurDto dto, Integer id) {
        return fournisseurRepository.findById(id).map(
                fournisseur -> {
                    fournisseur.setNomFournisseur(dto.getNomFournisseur());
                    fournisseur.setPrenomFournisseur(dto.getPrenomFournisseur());
                    fournisseur.setAdressFournisseur(dto.getAdressFournisseur());
                    fournisseur.setTelephoneFournisseur(dto.getTelephoneFournisseur());
                    fournisseur.setEmailFournisseur(dto.getEmailFournisseur());

                    Fournisseur updatedFournisseur = fournisseurRepository.save(fournisseur);

                    return FournisseurDto.fromEntity(updatedFournisseur);
                }
        ).orElseThrow(() -> new EntityNotFoundException("aucun fournisseur existe avec l'ID : " + id));
    }

    @Override
    public void delete(Integer id) {
        if (!fournisseurRepository.existsById(id)){
            throw new EntityNotFoundException("aucun fournisseur avec l'ID: " + id + " non trouvé !");
        }
        fournisseurRepository.deleteById(id);

    }

}
