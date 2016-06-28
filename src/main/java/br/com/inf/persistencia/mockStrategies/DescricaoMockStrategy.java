package br.com.inf.persistencia.mockStrategies;

import com.github.javafaker.Faker;
import uk.co.jemos.podam.common.AttributeStrategy;

/**
 * Estratégia de geração de descrições.
 */
public class DescricaoMockStrategy implements AttributeStrategy<String> {

    /**
     * <p>Retorna uma descrição random.</p>
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        Faker faker = new Faker();
        return faker.lorem().sentence(10);
    }
}
