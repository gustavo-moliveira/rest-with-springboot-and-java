package br.com.erudio.services;

import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.exceptions.ResourceNotFoundException;
import br.com.erudio.mapper.DozerMapper;
import br.com.erudio.models.Person;
import br.com.erudio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<br.com.erudio.data.vo.v1.PersonVO> findAll() {
        logger.info("[LOG SERVICE] - Finding all people!");
        return DozerMapper.parseListObjects(repository.findAll(), br.com.erudio.data.vo.v1.PersonVO.class)  ;
    }

    public br.com.erudio.data.vo.v1.PersonVO findById(Long id) {
        logger.info("[LOG SERVICE] - Finding one person!");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        return DozerMapper.parseObject(entity, br.com.erudio.data.vo.v1.PersonVO.class);
    }

    public br.com.erudio.data.vo.v1.PersonVO create(br.com.erudio.data.vo.v1.PersonVO person) {
        logger.info("[LOG SERVICE] - Creating one person!");
        var entity = DozerMapper.parseObject(person, Person.class);
        var vo = DozerMapper.parseObject(repository.save(entity), br.com.erudio.data.vo.v1.PersonVO.class);

        return vo;
    }

    public PersonVO update(PersonVO person) {
        logger.info("[LOG SERVICE] - Updating one person!");
        var entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        var vo = DozerMapper.parseObject(repository.save(entity), PersonVO.class);

        return vo;
    }

    public void delete(Long id) {
        logger.info("[LOG SERVICE] - Deleting one person!");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        repository.delete(entity);
    }

}
