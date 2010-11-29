package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fp3Plan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.Fp3Plan
 * @author MyEclipse Persistence Tools
 */

public class Fp3PlanDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Fp3PlanDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Fp3Plan transientInstance) {
		log.debug("saving Fp3Plan instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fp3Plan persistentInstance) {
		log.debug("deleting Fp3Plan instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fp3Plan findById(com.gopawpaw.erp.hibernate.f.Fp3PlanId id) {
		log.debug("getting Fp3Plan instance with id: " + id);
		try {
			Fp3Plan instance = (Fp3Plan) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.Fp3Plan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fp3Plan instance) {
		log.debug("finding Fp3Plan instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Fp3Plan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fp3Plan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fp3Plan instances");
		try {
			String queryString = "from Fp3Plan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fp3Plan merge(Fp3Plan detachedInstance) {
		log.debug("merging Fp3Plan instance");
		try {
			Fp3Plan result = (Fp3Plan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fp3Plan instance) {
		log.debug("attaching dirty Fp3Plan instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fp3Plan instance) {
		log.debug("attaching clean Fp3Plan instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Fp3PlanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Fp3PlanDAO) ctx.getBean("Fp3PlanDAO");
	}
}